package com.hamza.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import android.widget.ImageView
import com.hamza.tictactoe.databinding.ActivityMainBinding
import com.hamza.tictactoe.models.Board
import com.hamza.tictactoe.models.Cell
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val boardCells = Array(3) {
        arrayOfNulls<ImageView>(3)
    }

    var board = Board()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        loadBoard()
        actions()

    }

    //setup board
    private fun loadBoard() {
        for (i in boardCells.indices) {
            for (j in boardCells.indices) {
                boardCells[i][j] = ImageView(this)
                boardCells[i][j]?.layoutParams = GridLayout.LayoutParams().apply {
                    rowSpec = GridLayout.spec(i)
                    columnSpec = GridLayout.spec(j)
                    width = 250
                    height = 250
                    topMargin = 5
                    rightMargin = 5
                    leftMargin = 5
                    bottomMargin = 5
                }
                boardCells[i][j]?.setBackgroundColor(getColor(R.color.colorPrimary))
                boardCells[i][j]?.setOnClickListener(CellClickListener(i, j))
                binding.layoutBoard.addView(boardCells[i][j])
            }

        }

    }

    private fun actions() {
        binding.btnReset.setOnClickListener {
            board = Board()
            binding.textViewResult.text = ""
            mapBoardToUi()
        }
    }

    private fun mapBoardToUi() {

        for (i in board.board.indices) {
            for (j in board.board.indices) {
                when (board.board[i][j]) {
                    Board.player -> {
                        boardCells[i][j]?.setImageResource(R.drawable.o)
                        boardCells[i][j]?.isEnabled = false
                    }
                    Board.computer -> {
                        boardCells[i][j]?.setImageResource(R.drawable.x)
                        boardCells[i][j]?.isEnabled = false
                    }
                    else -> {
                        boardCells[i][j]?.setImageResource(0)
                        boardCells[i][j]?.isEnabled = true
                    }
                }
            }
        }
    }


    inner class CellClickListener(private val i: Int, private val j: Int) : View.OnClickListener {
        override fun onClick(p0: View?) {
            if (!board.isGameOver) {
                val cell = Cell(i, j)
                board.placeMove(cell, Board.player)
                board.miniMax(0, Board.computer)
                board.computerMove?.let {
                    board.placeMove(it, Board.computer)
                }

                mapBoardToUi()
            }
            when {
                board.ifComputerWon() -> binding.textViewResult.text = "Computer Won"
                board.ifPlayerWon() -> binding.textViewResult.text = "Player Won"
                board.isGameOver -> binding.textViewResult.text = "Game Over"
            }
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}