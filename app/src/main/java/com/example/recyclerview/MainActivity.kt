package com.example.myrecyclerview

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.Recipe
import com.example.recyclerview.RecipeData


class MainActivity : AppCompatActivity() {
    private var rvRecipes: RecyclerView? = null
    private val list: MutableList<Recipe> = mutableListOf()
    private lateinit var listRecipeAdapter: ListRecipeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRecipes = findViewById(R.id.rv_hero)
        rvRecipes?.setHasFixedSize(true)

        list.addAll(RecipeData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvRecipes?.layoutManager = LinearLayoutManager(this)
        listRecipeAdapter = ListRecipeAdapter(list as ArrayList<Recipe>)
        rvRecipes?.adapter = listRecipeAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }

            R.id.action_grid -> {
            }

            R.id.action_cardview -> {
            }
        }
    }
}
