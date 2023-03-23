package com.hamza.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.GridLayout
import android.widget.ImageView
import com.hamza.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private val boardCells = Array(3) {
        arrayOfNulls<ImageView>(3)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        loadBoard()

    }

    fun loadBoard() {
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
                binding.layoutBoard.addView(boardCells[i][j])
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}