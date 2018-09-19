package br.com.fernando.meusjogos.listajogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import br.com.fernando.meusjogos.R
import br.com.fernando.meusjogos.detalhejogo.DetalheActivity
import br.com.fernando.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)

        rvJogos.adapter = JogosAdapter(this, getJogos(),{
            //Toast.makeText(this, it.titulo, Toast.LENGTH_LONG).show()
            //Enviando dados para a tela de detalhes

            val detalheIntent = Intent(this, DetalheActivity::class.java)
            //detalheIntent.putExtra("TITULO", it.titulo)

            detalheIntent.putExtra("JOGO", it)
            startActivity(detalheIntent)

        })

        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun getJogos(): List<Jogo> {
        return listOf(
                Jogo(R.drawable.horizon, "Horizon: Zero Dawn", 2017, "Não informado"),
                Jogo(R.drawable.cod_bo3, "Call of Duty: Black Ops 3", 2017, "Não informado"),
                Jogo(R.drawable.crash_bandcoot, "Crash Bandcoot Trilogy", 2017, "Não informado"),
                Jogo(R.drawable.gow_4, "God of War ", 2017, "Não informado"),
                Jogo(R.drawable.gta5, "Grand Theft Auto 5", 2017, "Não informado"),
                Jogo(R.drawable.injustice, "Injustice: Gods among us", 2017, "Não informado"),
                Jogo(R.drawable.injustice_2, "Injustice 2", 2017, "Não informado"),
                Jogo(R.drawable.mk_xl, "Mortal Kombat XL", 2017, "Não informado"),
                Jogo(R.drawable.red_dead_2, "Red Dead Redemption 2", 2017, "Não informado"),
                Jogo(R.drawable.thelastofus, "The Last of Us Remasterizado", 2017, "Não informado")
        )
    }
}
