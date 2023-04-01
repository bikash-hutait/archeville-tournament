package com.example.archery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.text.Keymap;
import com.example.archery.appConfig.ApplicationConfig;
import com.example.archery.commands.CommandInvoker;
import com.example.archery.entities.PlayerCirlcleHit;
import com.example.archery.exceptions.NoSuchCommandException;
import com.example.archery.repositories.CircleHitRepository;
import com.example.archery.repositories.ICircleHitRepository;
import com.example.archery.repositories.ITeamRepository;
import com.example.archery.repositories.TeamRepository;
import com.example.archery.services.CirlcleHitService;
import com.example.archery.services.ICirlcleHitService;
import com.example.archery.services.ITeamService;
import com.example.archery.services.TeamService;

public class ArcheryApplication {


	// To run the application  ./gradlew run --args="INPUT_FILE=input.txt"
	public static void main(String[] args) {
		List<String> commandLineArgs = new LinkedList<>(Arrays.asList(args));
        String expectedSequence = "INPUT-FILE";
        String actualSequence = commandLineArgs.stream()
                .map(a -> a.split("=")[0])
                .collect(Collectors.joining("$"));
        if(expectedSequence.equals(actualSequence)){
            run(commandLineArgs);
        }

			System.out.println("-----: Team Information:----- ");
			ITeamRepository teamRepository=new TeamRepository();			  
			ITeamService iTeamService=new TeamService(teamRepository);		
			iTeamService.create("Gyrhuna", "János Diák", "Süsü");
			iTeamService.create("Achni", "Meilong", "Tianlong");
			iTeamService.create("Bathar", "Pakhangba", "Poubi Lai Paphal");

			//System.out.println(teamRepository.findAll());

			teamRepository.findAll().stream().forEach(
            (team) -> System.out.println(team.getTeamName()+" "+ team.getPlayer1()+" "+ team.getPlayer2()));


			System.out.println("-----: Player Circle Hit Information:----- ");
			ICircleHitRepository circleHitRepository=new CircleHitRepository();			  
			ICirlcleHitService icirlcleHitService=new CirlcleHitService(circleHitRepository);	
            // ROUND 1	
			icirlcleHitService.create("János Diák", "A", "1");
			icirlcleHitService.create("Süsü", "B", "1");
			icirlcleHitService.create("Meilong", "C", "1");
			icirlcleHitService.create("Tianlong", "D", "1");
			icirlcleHitService.create("Pakhangba", "E", "1");
            icirlcleHitService.create("Poubi Lai Paphal", "F", "1");

             // ROUND 2	
			icirlcleHitService.create("János Diák", "A", "2");
			icirlcleHitService.create("Süsü", "B", "2");
			icirlcleHitService.create("Meilong", "C", "2");
			icirlcleHitService.create("Tianlong", "F", "2");
			icirlcleHitService.create("Pakhangba", "E", "2");
            icirlcleHitService.create("Poubi Lai Paphal", "F", "2");  

            // ROUND 3	
			icirlcleHitService.create("János Diák", "A", "3");
			icirlcleHitService.create("Süsü", "B", "3");
			icirlcleHitService.create("Meilong", "A", "3");
			icirlcleHitService.create("Tianlong", "A", "3");
			icirlcleHitService.create("Pakhangba", "A", "3");
            icirlcleHitService.create("Poubi Lai Paphal", "A", "3");

        
             // ROUND 4	
			icirlcleHitService.create("János Diák", "A", "4");
			icirlcleHitService.create("Süsü", "A", "4");
			icirlcleHitService.create("Meilong", "A", "4");
			icirlcleHitService.create("Tianlong", "B", "4");
			icirlcleHitService.create("Pakhangba", "A", "4");
            icirlcleHitService.create("Poubi Lai Paphal", "A", "4");

             // ROUND 5

			icirlcleHitService.create("János Diák", "B", "5");
			icirlcleHitService.create("Süsü", "C", "5");
			icirlcleHitService.create("Meilong", "A", "5");
			icirlcleHitService.create("Tianlong", "B", "5");
			icirlcleHitService.create("Pakhangba", "E", "5");
            icirlcleHitService.create("Poubi Lai Paphal", "F", "5");

           

            System.out.println("János Diák,Süsü,Meilong,Tianlong,Pakhangba,Poubi Lai Paphal"); 

            for(int i=1; i<=5; i++){
                String num=Integer.toString(i);
                System.out.println( circleHitRepository.getDataRoundWise(num));
            }
            
           
         

}  
	


    public static void run(List<String> commandLineArgs) {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        CommandInvoker commandInvoker = applicationConfig.getCommandInvoker();
        BufferedReader reader;
        String inputFile = commandLineArgs.get(0).split("=")[1];
        System.out.println("inputfile"+inputFile);
        commandLineArgs.remove(0);
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            while (line != null) {
                List<String> tokens = Arrays.asList(line.split(" "));
                commandInvoker.executeCommand(tokens.get(0),tokens);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException | NoSuchCommandException e) {
            e.printStackTrace();
        }

    }
}





