package com.example.archery.services;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.example.archery.constants.Constants;
import com.example.archery.entities.Team;
import com.example.archery.repositories.ICircleHitRepository;
import com.example.archery.repositories.ITeamRepository;

public class ScoreBoardService implements IScoreBoardService {
    private final ICircleHitRepository circleHitRepository;
    private final ITeamRepository teamRepository;

    static Map<String, Integer> pointMap = new HashMap<>();  
    static {
        pointMap.put("A", 5);
        pointMap.put("B", 4);
        pointMap.put("C", 3);
        pointMap.put("D", 2);
        pointMap.put("E", 1);
        pointMap.put("F", 0);
    }
 
    private final Map<String,Integer> teamScoreMap =new HashMap<String,Integer>();
    private final LinkedHashMap<Integer,Integer> playerScoreMap =new LinkedHashMap<Integer,Integer>();
   
    
    public ScoreBoardService(ICircleHitRepository circleHitRepository, ITeamRepository teamRepository) {
        this.circleHitRepository = circleHitRepository;
        this.teamRepository = teamRepository;        
    }

    @Override
    public void tournamentScoreBoard(){

        List<String> team= teamRepository.findAll().stream()
        .map(p-> p.getTeamName()).collect(Collectors.toList());   
        

       

        int invTotal=0; int totalScore=0; int tempTotal=0;

        for(int i=1; i<=Constants.NUMBER_OF_MAX_ROUNDS; i++){
            String num=Integer.toString(i);
            System.out.println("Round "+num);
            System.out.println("Team scores");  
            System.out.println("----------------"); 

            for(int j=0; j<Constants.NUMBER_OF_MAX_TEAMS; j++){
           
           
            List<String> teamCircleHitList=circleHitRepository.getDataRoundAndTeamWise(team.get(j),num);
            //System.out.println(teamCircleHitList);
           
            for(int k=0; k<teamCircleHitList.size(); k++){                
                invTotal=(pointMap.get(teamCircleHitList.get(k))+i-1);              
                totalScore=totalScore+invTotal;
               
            }
            
            // TOTAL SCORE BY TEAM WISE
          
           
            if(i==1){
            tempTotal=totalScore;
            teamScoreMap.put(team.get(j), tempTotal);
            }
            else{
            tempTotal=totalScore+teamScoreMap.get(team.get(j));
            teamScoreMap.put(team.get(j), tempTotal);
            //System.out.println("PREV:"+teamScoreMap.get(team.get(j))); 
            }
           
            //System.out.println(team.get(j)+":"+totalScore+"+"+teamScoreMap.get(team.get(j)));
            System.out.println(team.get(j)+":"+teamScoreMap.get(team.get(j)));           
            totalScore=0;
            invTotal=0;
           // teamScoreMap.put(team.get(j),0);
                     

            }
            //System.out.println("+++"+teamScoreMap); 
            
            getIndivisualPlayerScoreRoundWise(num);

           
        }
    
    }

    @Override
    public void getBonusPointsRoundWise(String teamName, String roundNum) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getIndivisualPlayerScoreRoundWise(String roundNumber) {
       
                    // TOTAL SCORE BY TEAM WISE
                    System.out.println("Individual Scores");  
                    System.out.println("----------------");
                  
                    List<String> ListOfPlayer1= teamRepository.findAll().stream()
                    .map(p-> p.getPlayer1()).collect(Collectors.toList());
        
                    List<String> ListOfPlayer2= teamRepository.findAll().stream()
                    .map(p-> p.getPlayer2()).collect(Collectors.toList());
        
                   
                    //System.out.println(ListOfPlayer1); 
                   // System.out.println(ListOfPlayer2); 
                    final LinkedHashMap<Integer,String> Allplayers= new LinkedHashMap<Integer,String>();
                    for(int l=0; l<3; l++){               
                        int p1=1*l+l;
                        int p2=p1+1;
                        String s1=ListOfPlayer1.get(l);
                        String s2=ListOfPlayer2.get(l);
                        Allplayers.put(p1, s1);
                        Allplayers.put(p2, s2);
                       
                    }
                  
                    
                    int indivisual_score=0; int totalScore_player=0; int tempTotal_player=0;
                    System.out.println(Allplayers);
                    for(int p=1; p<=Allplayers.size(); p++){                           
                           
                    List<String> playerCircleHitList=circleHitRepository.findCircleByPlayerName(Allplayers.get(p-1), roundNumber);
                    System.out.println("#"+playerCircleHitList); 
                   
                    for(int k=0; k<playerCircleHitList.size(); k++){                          
                        indivisual_score=(pointMap.get(playerCircleHitList.get(k))); 
                       
                        System.out.println("@"+indivisual_score); 
                                     
                    }
                       
                  
                    
                    // TOTAL SCORE BY PLAYER WISE
                    //indivisual_score=indivisual_score+p-1;
                    System.out.println("@@:"+indivisual_score); 
                    totalScore_player=totalScore_player+indivisual_score;
                    tempTotal_player=totalScore_player;                  
                    System.out.println(Allplayers.get(p-1)+": "+tempTotal_player);                             
                    totalScore_player=0;
                    indivisual_score=0;
                    System.out.println(); 
                
                
                   
                    }          
        
    
        
    }

    @Override
    public void getTeamScoreRoundWise(String teamName, String roundNum) {
        // TODO Auto-generated method stub
        
    }


    

}
