package br.com.paulosalvatore.ocean_android_a4_01_10_18

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	fun enviar(view: View) {
		tvNome.text = "Olá, Paulo Salvatore"
//		Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
		longToast("Botão clicado")
	}
}
