package com.example.todonotesapp.clickListeners

import com.example.todonotesapp.model.Notes

interface ItemClickListener {
    fun onClick(notes: Notes)
}