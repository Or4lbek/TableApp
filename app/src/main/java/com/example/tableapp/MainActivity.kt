package com.example.tableapp

import android.os.Bundle
import android.util.TypedValue
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import com.example.tableapp.R as coreR


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(coreR.layout.activity_main)


        val tableLayout = findViewById<TableLayout>(coreR.id.tableLayout)

        val headers = arrayOf(
            "Header 1",
            "Header 2",
            "Header 3",
            "Header 4",
            "Header 1",
            "Header 2",
            "Header 3",
            "Header 4"
        )
        val data = arrayOf(
            arrayOf("Data 1", "Data 2", "Data 3", "Data 4", "Data 1", "Data 2", "Data 3", "Data 4"),
            arrayOf("Data 5", "Data 6", "Data 7", "Data 8", "Data 1", "Data 2", "Data 3", "Data 4")
        )

// Create header row

// Create header row
        val headerRow = TableRow(this)
        headerRow.setPadding(10, 10, 10, 10)
        headerRow.setBackgroundColor(ContextCompat.getColor(this, coreR.color.black))
        for (header in headers) {
            val cell = TextView(this)
            cell.text = header
            cell.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22f)
            // Customize cell properties if needed
            headerRow.addView(cell)
        }
        tableLayout.addView(headerRow)

// Create data rows

// Create data rows
        for (rowData in data) {
            val dataRow = TableRow(this)
            dataRow.setPadding(10, 10, 10, 10)
            for (cellData in rowData) {
                val cell = TextView(this)
                cell.setPadding(10)
                cell.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22f)
                cell.text = cellData
                // Customize cell properties if needed
                dataRow.addView(cell)
            }
            tableLayout.addView(dataRow)
        }
    }
}