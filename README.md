# tic-tac-toe-minimax
An implementation of Minimax AI Algorithm on Tic-Tac-Toe
<p align="center">
<img src="https://user-images.githubusercontent.com/80759221/228569948-12dd9c30-0efa-468f-823e-bef1f3a3e4cb.png"   
</p>

## What is Minimax?
Minimax algorithm is a decision rule used in artificial intelligence, decision theory, game theory, statistics, and philosophy for minimizing the possible loss for a worst-case (maximum loss) scenario1. It is a kind of backtracking algorithm that is used in decision making and game theory to find the optimal move for a player, assuming that your opponent also plays optimally2. It is widely used in two-player turn-based games such as Tic-Tac-Toe, Backgammon, Mancala, Chess, etc.

## Here's a pseudocode :- 
<p align="center">
<img src="https://user-images.githubusercontent.com/80759221/228576543-f4759422-9336-4b5f-bf07-4f026c9066e3.png" 
width ="70%" height="70%"
</p>

## How does it works?
- The minimax function takes two parameters: the node representing the current state of the game, and a boolean maximizingPlayer that indicates whether we are currently maximizing or minimizing the score.

- If the node is a terminal node (i.e., the game has ended), we return the value of the node.

- If maximizingPlayer is true, we initialize bestValue to negative infinity and loop over all the child nodes of node. For each child node, we recursively call minimax with maximizingPlayer set to false to minimize the score. We update bestValue to be the maximum of bestValue and the returned value.

- If maximizingPlayer is false, we initialize bestValue to positive infinity and loop over all the child nodes of node. For each child node, we recursively call minimax with maximizingPlayer set to true to maximize the score. We update bestValue to be the minimum of bestValue and the returned value.

- We return bestValue as the optimal score for the current state of the game.

## Game Tree
<p align="center">
<img src="https://user-images.githubusercontent.com/80759221/236447424-85be5d46-6208-4559-9ccb-2d3625c31245.jpg" 
width ="70%" height="70%"
</p>
