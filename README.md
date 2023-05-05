# tic-tac-toe-minimax
An implementation of Minimax AI Algorithm on Tic-Tac-Toe
<p align="center">
<img src="https://user-images.githubusercontent.com/80759221/228569948-12dd9c30-0efa-468f-823e-bef1f3a3e4cb.png"   
</p>

## What is Minimax?
Minimax algorithm is a decision rule used in artificial intelligence, decision theory, game theory, statistics, and philosophy for minimizing the possible loss for a worst-case (maximum loss) scenario1. It is a kind of backtracking algorithm that is used in decision making and game theory to find the optimal move for a player, assuming that your opponent also plays optimally2. It is widely used in two-player turn-based games such as Tic-Tac-Toe, Backgammon, Mancala, Chess, etc.


## How does it works?
Minimax is a decision-making algorithm used in game theory, particularly in two-player games like Tic Tac Toe. The algorithm is used to determine the best possible move a player can make at any given point in the game. Here's how minimax works in Tic Tac Toe:

-The algorithm starts by creating a game tree that shows all possible moves and outcomes for both players.<br>
-Each node in the game tree represents a possible state of the game, with edges representing the possible moves from that state.<br>
-At the bottom of the tree, the algorithm assigns a score to each possible end state (win, loss, or draw) based on who wins the game.<br>
-The algorithm then works its way back up the tree, evaluating each node's score based on whether it's a player's turn or the opponent's turn.<br>
-The algorithm assumes that both players are playing optimally, so it alternates between maximizing the score for itself and minimizing the score for its opponent.<br>
-Finally, the algorithm chooses the move that leads to the highest score for itself.<br>
  
In summary, minimax in Tic Tac Toe works by recursively evaluating all possible moves and outcomes in a game tree and choosing the move that leads to the best possible outcome for the player using the algorithm

## Game Tree
<p align="center">
<img src="https://user-images.githubusercontent.com/80759221/236447424-85be5d46-6208-4559-9ccb-2d3625c31245.jpg" 
width ="70%" height="70%"
</p>
