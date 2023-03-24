package com.hamza.tictactoe.models

class Board {
    companion object {
        const val player = "o"
        const val computer = "x"
    }

    val board = Array(3) {
        arrayOfNulls<String>(3)
    }
    val availableCells: List<Cell>
        get() {
            val cells = mutableListOf<Cell>()
            for (i in board.indices) {
                for (j in board.indices) {
                    if (board[i][j].isNullOrEmpty()) {
                        cells.add(Cell(i, j))
                    }
                }
            }
            return cells
        }

    fun placeMove(cell: Cell, player: String) {
        board[cell.i][cell.j] = player
    }
}