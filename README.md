<p dir="auto"><strong><span style="text-shadow: rgba(136, 136, 136, 0.8) 3px 3px 2px; font-size: 19px;">The Archeville Super-Archy Tournament</span></strong></p>
<p dir="auto">The Archeville super-archy tournament is a team archery tournament that happens once every four years. Every nation sends two of its best archers to the tournament, and the first team to reach 60 points wins. The archery board has 5 concentric circles - A, B, C, D, and E, A being the innermost. A carries 5 points and E carries 1 point.</p>
<p dir="auto">Points for every circle increase by 1 at every round. For example, In the 4th round, A will carry 8 points while E will carry 4 points. Hitting outside the board (F) will always be 0.</p>
<p dir="auto">If both archers in a team hit the same circle in a round, a bonus of 2 points is given to the team for synchronicity. The game finishes when one team reaches 60 points.</p>
<p dir="auto">If more than one team crosses 60 points in a round, the team with the highest score wins.</p>
<p dir="auto">You have been hired to build the scoreboard for the contest. The first set of inputs will be the participating nations and their participants. The next input is the order in which the scores are coming in. Which is followed by lines of input for each round. The scoreboard must be refreshed after each round with scores of each team, individual scores, and bonus points. The program stops once a team wins.</p>
<p dir="auto"><strong><span style="text-shadow: 3px 3px 2px rgba(136, 136, 136, 0.8);">Sample input</span></strong></p>
<p dir="auto"><strong>Team name followed by two players</strong></p>
<p dir="auto">Gyrhuna, J&aacute;nos Di&aacute;k, S&uuml;s&uuml;</p>
<p dir="auto">Achni, Meilong, Tianlong</p>
<p dir="auto">Bathar, Pakhangba, Poubi Lai Paphal</p>
<p dir="auto"><strong>Circle name per round by the player</strong></p>
<p dir="auto">J&aacute;nos Di&aacute;k,S&uuml;s&uuml;,Meilong,Tianlong,Pakhangba,Poubi Lai Paphal</p>
<p dir="auto">A,B,C,D,E,F</p>
<p dir="auto">A,B,C,D,E,F</p>
<p dir="auto">A,B,A,A,A,A</p>
<p dir="auto">A,A,A,B,A,A</p>
<p dir="auto">B,C,A,B,E,F</p>
<p dir="auto"><strong><span style="text-shadow: 3px 3px 2px rgba(136, 136, 136, 0.8);">Sample output</span></strong></p>
<p dir="auto"><strong>Round 1</strong></p>
<p dir="auto"><strong>Team scores</strong></p>
<hr>
<p dir="auto">Gyrhuna: 9</p>
<p dir="auto">Achni: 5</p>
<p dir="auto">Bathar: 1</p>
<p dir="auto"><strong>Individual Scores</strong></p>
<hr>
<p dir="auto">J&aacute;nos Di&aacute;k: 5</p>
<p dir="auto">S&uuml;s&uuml;: 4</p>
<p dir="auto">Meilong: 3</p>
<p dir="auto">Tianlong: 2</p>
<p dir="auto">Pakhangba: 1</p>
<p dir="auto">Poubi Lai Paphal: 0</p>
<p dir="auto"><strong>Bonus points</strong></p>
<hr>
<p dir="auto">Gyrhuna: 0</p>
<p dir="auto">Achni: 0</p>
<p dir="auto">Bathar: 0</p>
<p dir="auto"><strong>Round 2</strong></p>
<p dir="auto"><strong>Team Scores</strong></p>
<hr>
<p dir="auto">Gyrhuna: 20</p>
<p dir="auto">Achni: 12</p>
<p dir="auto">Bathar: 3</p>
<p dir="auto"><strong>Individual Scores</strong></p>
<hr>
<p dir="auto">J&aacute;nos Di&aacute;k: 11</p>
<p dir="auto">S&uuml;s&uuml;: 9</p>
<p dir="auto">Meilong: 7</p>
<p dir="auto">Tianlong: 5</p>
<p dir="auto">Pakhangba: 3</p>
<p dir="auto">Poubi Lai Paphal: 0</p>
<p dir="auto"><strong>Bonus points</strong></p>
<hr>
<p dir="auto">Gyrhuna: 0</p>
<p dir="auto">Achni: 0</p>
<p dir="auto">Bathar: 0</p>
<p dir="auto"><strong>Round 3</strong></p>
<p dir="auto"><strong>Team Scores</strong></p>
<hr>
<p dir="auto">Gyrhuna: 33</p>
<p dir="auto">Achni: 28</p>
<p dir="auto">Bathar: 19</p>
<p dir="auto"><strong>Individual Scores</strong></p>
<hr>
<p dir="auto">J&aacute;nos Di&aacute;k: 18</p>
<p dir="auto">S&uuml;s&uuml;: 15</p>
<p dir="auto">Meilong: 14</p>
<p dir="auto">Tianlong: 12</p>
<p dir="auto">Pakhangba: 10</p>
<p dir="auto">Poubi Lai Paphal: 7</p>
<p dir="auto"><span style="text-align: inherit;"><strong>Bonus points</strong></span></p>
<p dir="auto">Gyrhuna: 0</p>
<p dir="auto">Achni: 2</p>
<p dir="auto">Bathar: 2</p>
<p dir="auto"><strong>Round 4</strong></p>
<p dir="auto"><strong>Team Scores</strong></p>
<hr>
<p dir="auto">Gyrhuna: 51</p>
<p dir="auto">Achni: 43</p>
<p dir="auto">Bathar: 37</p>
<h2 dir="auto"><a href="https://github.com/bikash-hutait/archeville-tournament/edit/master/README.md#individual-scores"><svg version="1.1" width="16" height="16">
            <path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path>
        </svg></a>Individual scores</h2>
<p dir="auto">J&aacute;nos Di&aacute;k: 26</p>
<p dir="auto">S&uuml;s&uuml;: 23</p>
<p dir="auto">Meilong: 22</p>
<p dir="auto">Tianlong: 19</p>
<p dir="auto">Pakhangba: 18</p>
<p dir="auto">Poubi Lai Paphal: 15</p>
<h2 dir="auto"><a href="https://github.com/bikash-hutait/archeville-tournament/edit/master/README.md#bonus-points-1"><svg version="1.1" width="16" height="16">
            <path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path>
        </svg></a>Bonus points</h2>
<p dir="auto">Gyrhuna: 2</p>
<p dir="auto">Achni: 2</p>
<p dir="auto">Bathar: 4</p>
<p dir="auto">Round 5</p>
<h2 dir="auto"><a href="https://github.com/bikash-hutait/archeville-tournament/edit/master/README.md#team-scores"><svg version="1.1" width="16" height="16">
            <path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path>
        </svg></a>Team Scores</h2>
<p dir="auto">Gyrhuna: 66</p>
<p dir="auto">Achni: 60</p>
<p dir="auto">Bathar: 42</p>
<h2 dir="auto"><a href="https://github.com/bikash-hutait/archeville-tournament/edit/master/README.md#individual-scores-1"><svg version="1.1" width="16" height="16">
            <path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path>
        </svg></a>Individual scores</h2>
<p dir="auto">J&aacute;nos Di&aacute;k: 34</p>
<p dir="auto">S&uuml;s&uuml;: 30</p>
<p dir="auto">Meilong: 31</p>
<p dir="auto">Tianlong: 27</p>
<p dir="auto">Pakhangba: 23</p>
<p dir="auto">Poubi Lai Paphal: 15</p>
<h2 dir="auto"><a href="https://github.com/bikash-hutait/archeville-tournament/edit/master/README.md#bonus-points-2"><svg version="1.1" width="16" height="16">
            <path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path>
        </svg></a>Bonus points</h2>
<p dir="auto">Gyrhuna: 2</p>
<p dir="auto">Achni: 2</p>
<p dir="auto">Bathar: 4</p>
<p dir="auto"><strong><u><span style="text-shadow: 3px 3px 2px rgba(136, 136, 136, 0.8);">Game over. Gyrhuna won!!!</span></u></strong></p>
<h1 dir="auto"><a href="https://github.com/bikash-hutait/archeville-tournament/edit/master/README.md#archeville-tournament"><svg version="1.1" width="16" height="16">
            <path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path>
        </svg></a>Archeville-tournament</h1>
<h3 dir="auto"><a href="https://github.com/bikash-hutait/archeville-tournament/edit/master/README.md#how-to-run-this-application"><svg version="1.1" width="16" height="16">
            <path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path>
        </svg></a>How to run this application?</h3>
<ol dir="auto">
    <li>
        <p dir="auto">Open VS-code or any other IDE.</p>
    </li>
    <li>
        <p dir="auto">Download or clone the git repository.</p>
    </li>
</ol>
<p dir="auto"><code>git clone <a href="https://github.com/bikash-hutait/archeville-tournament.git">https://github.com/bikash-hutait/archeville-tournament.git</a></code></p>
<ol start="3" dir="auto">
    <li>
        <p dir="auto">To run the application ./gradlew run --args=&quot;INPUT_FILE=input.txt&quot;</p>
    </li>
</ol>
