package com.example.archery.services;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.archery.constants.Constants;
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
    private final Map<String,Integer> finalScoreMap =new HashMap<String,Integer>();
    private final Map<String,Integer> bonusScoreMap =new HashMap<String,Integer>();
    private final Map<String,Integer> playerScoreMap =new HashMap<String,Integer>();
   
    
    public ScoreBoardService(ICircleHitRepository circleHitRepository, ITeamRepository teamRepository) {
        this.circleHitRepository = circleHitRepository;
        this.teamRepository = teamRepository;        
    }

    @Override
    public void tournamentScoreBoard(){

        List<String> team= teamRepository.findAll().stream()
        .map(p-> p.getTeamName()).collect(Collectors.toList()); 

        int invTotal=0; int totalScore=0; int tempTotal=0; int prevScore=0; int prevBonus=0;

        for(int i=1; i<=Constants.NUMBER_OF_MAX_ROUNDS; i++){
            String num=Integer.toString(i);
            System.out.println(); 
            System.out.println("Round "+num);
            System.out.println("Team scores");  
            System.out.println("----------------"); 

            for(int j=0; j<Constants.NUMBER_OF_MAX_TEAMS; j++){
                
                // CHECKING IF IS THERE ANY BONUS POINTS FOR A TEAM
                int bonus=0;
                boolean isBonusPoint=hasBonusPoints(team.get(j), num);
                    if(isBonusPoint){
                        prevBonus=bonusScoreMap.get(team.get(j));
                        bonus=prevBonus;
                        bonusScoreMap.put(team.get(j), bonus);
                        //System.out.println("B:"+bonusScoreMap);
                    }  else {
                        bonus=0;
                        bonusScoreMap.put(team.get(j), bonus);
                    }

            List<String> teamCircleHitList=circleHitRepository.getDataRoundAndTeamWise(team.get(j),num);
            
           
            for(int k=0; k<teamCircleHitList.size(); k++){  
                if(teamCircleHitList.get(k).equals("F")){
                 //System.out.println(teamCircleHitList.contains("F"));
                invTotal=pointMap.get(teamCircleHitList.get(k)); 
                //System.out.println(invTotal);               
                } 
                else {
                invTotal=pointMap.get(teamCircleHitList.get(k))+(i-1);                    
                }  
                //System.out.println(teamCircleHitList);
                //System.out.println("INV: "+invTotal);        
                totalScore=totalScore+invTotal;               
                }
            
          
            // TOTAL SCORE BY TEAM WISE          
           
            if(i==1){
            tempTotal=totalScore+bonus;
            //System.out.println("BONUS:"+bonus);
            teamScoreMap.put(team.get(j), tempTotal);
            }
            else{
            prevScore=teamScoreMap.get(team.get(j));
            tempTotal=prevScore+totalScore+bonus;          
            teamScoreMap.put(team.get(j), tempTotal);
            //System.out.println("BONUS:"+bonus);
           // System.out.println("PREV:"+prevScore); 
            }
           
            System.out.println(team.get(j)+":"+tempTotal);           
            finalScoreMap.put(team.get(j), tempTotal);
            
            totalScore=0;
            invTotal=0;
            prevScore=0;
            tempTotal=0;

            //System.out.println(team.get(j)+":"+bonus);          

            }
            //System.out.println("+++"+teamScoreMap); 
            
            getIndivisualPlayerScoreRoundWise(num);

            System.out.println("Bonus points:");
            System.out.println("-------------"); 

            for(int n=0; n<Constants.NUMBER_OF_MAX_TEAMS; n++){
           
            int bonusPoints=0; int previousBonus=0;
            boolean isBonus=hasBonusPoints(team.get(n), num);
           
            if(isBonus){
                previousBonus=bonusScoreMap.get(team.get(n));
                bonusPoints=previousBonus+2;
                bonusScoreMap.put(team.get(n), bonusPoints);
            }  else {
                bonusPoints=0;
                bonusScoreMap.put(team.get(n), bonusPoints);
            }

            System.out.println(team.get(n)+":"+bonusPoints);

            }
           
     



        }

               // FIND MAXIMUM SCORE 
               int maxScoreValueInMap = (Collections.max(finalScoreMap.values()));
 
               // Iterate through HashMap
               for (java.util.Map.Entry<String, Integer> entry : finalScoreMap.entrySet()) {
        
                   if (entry.getValue() == maxScoreValueInMap) { 
                       // Print the key with max value
                      
                       String winTeamName =entry.getKey();
                       System.out.printf("Game over. %s won!!!", winTeamName); 
                       
                       
       
       
                   }
               }
    
    }

    @Override
    public boolean hasBonusPoints(String teamName, String roundNum) {
        List<String> listOfTeamCircle= circleHitRepository.findAll().stream() 
        .filter(t-> t.getTeamName().equals(teamName))      
        .filter(r-> r.getRoundName().equals(roundNum))
        .map(p-> p.getCircleName()).collect(Collectors.toList());       

       //System.out.println(listOfTeamCircle);
       String s1=listOfTeamCircle.get(0);
       String s2=listOfTeamCircle.get(1);
       if(s1.equals(s2)){
        bonusScoreMap.put(teamName, 2);
        return true;
       
      }
      else {
         return false;
      }
            
    }

    @Override
    public void getIndivisualPlayerScoreRoundWise(String roundNumber) {
       
                    // TOTAL SCORE BY TEAM WISE
                    System.out.println();
                    System.out.println("Individual Scores");  
                    System.out.println("----------------");
                  
                    List<String> ListOfPlayer1= teamRepository.findAll().stream()
                    .map(p-> p.getPlayer1()).collect(Collectors.toList());
        
                    List<String> ListOfPlayer2= teamRepository.findAll().stream()
                    .map(p-> p.getPlayer2()).collect(Collectors.toList());
        
                   
                    final LinkedHashMap<Integer,String> Allplayers= new LinkedHashMap<Integer,String>();
                    int roundNum=Integer.parseInt(roundNumber);
                  
                    for(int l=0; l<3; l++){               
                        int p1=1*l+l;
                        int p2=p1+1;
                        String s1=ListOfPlayer1.get(l);
                        String s2=ListOfPlayer2.get(l);
                        Allplayers.put(p1, s1);
                        Allplayers.put(p2, s2);
                       
                    }
                  
                    
                    int indivisual_score=0; int totalScore_player=0;
                    int tempTotal_score=0; int playerPrevScore=0;
                    
                    for(int p=1; p<=Allplayers.size(); p++){                           
                           
                    List<String> playerCircleHitList=circleHitRepository.findCircleByPlayerName(Allplayers.get(p-1), roundNumber);
                  
                   
                   
                       
                    for(int k=0; k<playerCircleHitList.size(); k++){  
                        if(playerCircleHitList.get(k).equals("F")){                        
                         indivisual_score=pointMap.get(playerCircleHitList.get(k));                        
                                  
                        } 
                        else {
                        indivisual_score=pointMap.get(playerCircleHitList.get(k))+(roundNum-1); 
                        
                        } 
                        
                        totalScore_player=totalScore_player+indivisual_score;                        

                        }
                    
                    
                        if(playerScoreMap.containsKey(Allplayers.get(p-1)))
                        playerPrevScore=playerScoreMap.get(Allplayers.get(p-1));
                        else
                        playerPrevScore=0;
                      
                   tempTotal_score=playerPrevScore+totalScore_player;          
                   playerScoreMap.put(Allplayers.get(p-1), tempTotal_score);
                  
                   
                    System.out.println(Allplayers.get(p-1)+": "+tempTotal_score);                             
                    playerScoreMap.put(Allplayers.get(p-1), tempTotal_score);
                    playerPrevScore=0;
                    indivisual_score=0;
                    tempTotal_score=0;
                    totalScore_player=0;              
                
                   
                    }          
        
    
        
    }

   


    

}
