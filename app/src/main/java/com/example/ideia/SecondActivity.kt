package com.example.ideia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ideia.databinding.ActivitySecondBinding
import android.view.animation.AnimationUtils
import android.widget.TextView
import com.example.ideia.MainActivity

class SegundaActivity : AppCompatActivity() {

    private val ideias = listOf(
        "Escrever um livro de ficção científica sobre viagens intergalácticas.",
        "Criar um aplicativo de aprendizado de idiomas com reconhecimento de voz.",
        "Inventar um dispositivo para reciclagem automática de resíduos.",
        "Organizar um festival de música ao ar livre.",
        "Projetar um carro elétrico autônomo.",
        "Desenvolver um jogo de realidade virtual imersivo.",
        "Fundar uma organização sem fins lucrativos.",
        "Criar um sistema de irrigação inteligente para plantas.",
        "Construir uma casa sustentável com materiais reciclados.",
        "Desenvolver um assistente virtual com inteligência artificial.",
        "Lançar uma linha de roupas ecológicas.",
        "Criar um aplicativo de entrega de comida vegana.",
        "Desenvolver um programa de treinamento físico personalizado.",
        "Inventar um dispositivo para economia de energia em residências.",
        "Fundar um centro de reabilitação para animais selvagens.",
        "Criar um aplicativo de gerenciamento financeiro pessoal.",
        "Desenvolver um sistema de segurança residencial inteligente.",
        "Lançar uma plataforma online de cursos gratuitos.",
        "Inventar um brinquedo educativo para crianças.",
        "Organizar um evento de conscientização sobre sustentabilidade.",
        "Criar um aplicativo de assistência médica remota.",
        "Desenvolver um jogo educativo para crianças.",
        "Inventar um dispositivo para purificação de água.",
        "Criar uma plataforma de crowdfunding para projetos sociais.",
        "Fundar um programa de mentoria para jovens empreendedores.",
        "Desenvolver um aplicativo de guia turístico virtual.",
        "Inventar uma solução para monitoramento de poluição do ar.",
        "Criar um sistema de compartilhamento de bicicletas elétricas.",
        "Desenvolver um aplicativo de leitura interativa para crianças.",
        "Inventar um dispositivo para auxiliar pessoas com deficiência visual.",
        "Criar um programa de voluntariado comunitário.",
        "Fundar um centro de reciclagem e reutilização de materiais.",
        "Desenvolver um sistema de controle de gastos pessoais.",
        "Inventar um dispositivo para auxiliar no controle do estresse.",
        "Criar uma plataforma de conexão entre artistas e público.",
        "Desenvolver um aplicativo de exercícios físicos para idosos.",
        "Inventar uma solução para redução do desperdício de alimentos.",
        "Criar um programa de orientação profissional para jovens.",
        "Desenvolver um sistema de gerenciamento de tarefas online.",
        "Inventar um dispositivo para auxiliar na meditação.",
        "Criar uma plataforma de troca de livros usados.",
        "Desenvolver um aplicativo de controle de hábitos saudáveis.",
        "Inventar uma solução para monitoramento de qualidade do sono.",
        "Criar um programa de capacitação em tecnologia para idosos.",
        "Desenvolver um sistema de gestão de eventos.",
        "Inventar um dispositivo para auxiliar na prática",

        // Adicione mais ideias à lista conforme necessário
    )

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRandomIdeia()

        binding.tvIdeia.setOnClickListener {
            setupRandomIdeia()
        }

        binding.btVoltar.setOnClickListener {
            onBackPressed()
        }
        binding.btVoltar.setOnClickListener {
            val voltarPrincipal = Intent(this, MainActivity::class.java)
            startActivity(voltarPrincipal)
            overridePendingTransition(0,R.anim.slide_out_down)
        }
        binding.btNovaIdeia.setOnClickListener {
            setupRandomIdeia()
        }

    }

    private fun setupRandomIdeia() {
        val ideiaAleatoria = gerarIdeiaAleatoria()
        binding.tvIdeia.text = ideiaAleatoria
        binding.tvIdeia.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in))
    }


    private fun gerarIdeiaAleatoria(): String {
        val indice = (0 until ideias.size).random()
        return ideias[indice]
    }
}
