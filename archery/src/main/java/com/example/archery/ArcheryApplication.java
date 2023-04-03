package com.example.archery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import com.example.archery.appConfig.ApplicationConfig;
import com.example.archery.commands.CommandInvoker;
import com.example.archery.exceptions.NoSuchCommandException;
import com.example.archery.repositories.CircleHitRepository;
import com.example.archery.repositories.ICircleHitRepository;
import com.example.archery.repositories.ITeamRepository;
import com.example.archery.repositories.TeamRepository;
import com.example.archery.services.CirlcleHitService;
import com.example.archery.services.ICirlcleHitService;
import com.example.archery.services.IScoreBoardService;
import com.example.archery.services.ITeamService;
import com.example.archery.services.ScoreBoardService;
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

        System.out.println("-----: Team name followed by players :----- ");
        ITeamRepository teamRepository=new TeamRepository();			  
        ITeamService iTeamService=new TeamService(teamRepository);		
        iTeamService.create("Gyrhuna", "János Diák", "Süsü");
        iTeamService.create("Achni", "Meilong", "Tianlong");
        iTeamService.create("Bathar", "Pakhangba", "Poubi Lai Paphal");

         //DISPLAY TEAM WITH PLAYERS
        teamRepository.getAllTeamWithPlayers();

        System.out.println("-----: Circle name per round by the player :----- ");
        ICircleHitRepository circleHitRepository=new CircleHitRepository();			  
        ICirlcleHitService icirlcleHitService=new CirlcleHitService(circleHitRepository);	
         // ROUND 1	
        icirlcleHitService.create("Gyrhuna","János Diák", "A", "1");
        icirlcleHitService.create("Gyrhuna","Süsü", "B", "1");
        icirlcleHitService.create( "Achni","Meilong", "C", "1");
        icirlcleHitService.create( "Achni","Tianlong", "D", "1");
        icirlcleHitService.create( "Bathar","Pakhangba", "E", "1");
        icirlcleHitService.create( "Bathar","Poubi Lai Paphal", "F", "1");

        //   ROUND 2	
        icirlcleHitService.create("Gyrhuna","János Diák", "A", "2");
        icirlcleHitService.create("Gyrhuna","Süsü", "B", "2");
        icirlcleHitService.create( "Achni","Meilong", "C", "2");
        icirlcleHitService.create( "Achni","Tianlong", "D", "2");
        icirlcleHitService.create( "Bathar","Pakhangba", "E", "2");
        icirlcleHitService.create( "Bathar","Poubi Lai Paphal", "F", "2");  

        //  ROUND 3	
        icirlcleHitService.create("Gyrhuna","János Diák", "A", "3");
        icirlcleHitService.create("Gyrhuna","Süsü", "B", "3");
        icirlcleHitService.create( "Achni","Meilong", "A", "3");
        icirlcleHitService.create( "Achni","Tianlong", "A", "3");
        icirlcleHitService.create( "Bathar","Pakhangba", "A", "3");
        icirlcleHitService.create( "Bathar","Poubi Lai Paphal", "A", "3");

  
        //   ROUND 4	
        icirlcleHitService.create("Gyrhuna","János Diák", "A", "4");
        icirlcleHitService.create("Gyrhuna","Süsü", "A", "4");
        icirlcleHitService.create( "Achni","Meilong", "A", "4");
        icirlcleHitService.create( "Achni","Tianlong", "B", "4");
        icirlcleHitService.create( "Bathar","Pakhangba", "A", "4");
        icirlcleHitService.create( "Bathar","Poubi Lai Paphal", "A", "4");

        //   ROUND 5

        icirlcleHitService.create("Gyrhuna","János Diák", "B", "5");
        icirlcleHitService.create("Gyrhuna","Süsü", "C", "5");
        icirlcleHitService.create( "Achni","Meilong", "A", "5");
        icirlcleHitService.create( "Achni","Tianlong", "B", "5");
        icirlcleHitService.create( "Bathar","Pakhangba", "E", "5");
        icirlcleHitService.create( "Bathar","Poubi Lai Paphal", "F", "5");
        
        // GET ALL PLAYERS NAME
        teamRepository.getAllPlayers();
            
       System.out.println(); 

       // GET ALL CIRCLE HITS BY THE PLAYERS
        circleHitRepository.findAllCirclesHits();
      
        // TEAM SCORE ROUND WISE
        System.out.println(); 
        System.out.println("Sample output");  
        System.out.println();    

        // GET TOURNAMENT SCOREBOARD TEAM WISE
        IScoreBoardService scoreBoardService=new ScoreBoardService(circleHitRepository, teamRepository);
        scoreBoardService.tournamentScoreBoard();

        System.out.println();   
        System.out.println("************"); 
        //scoreBoardService.tournamentScoreBoard();


  
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
                List<String> tokens = Arrays.asList(line.split("/"));
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





