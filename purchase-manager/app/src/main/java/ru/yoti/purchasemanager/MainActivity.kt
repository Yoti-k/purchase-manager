package ru.yoti.purchasemanager

import android.app.Activity
import android.os.Bundle

/**
 * Стартовая Activity проекта.
 * На лабораторной №0 здесь пока нет бизнес-логики приложения.
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
