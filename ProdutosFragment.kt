package com.example.padariadeliciaapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ProdutosFragment : Fragment(R.layout.fragment_produtos) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Botão que leva para os detalhes do produto
        val btnDetalhe = view.findViewById<Button>(R.id.btnDetalhePao)
        btnDetalhe.setOnClickListener {
            val action = ProdutosFragmentDirections
                .actionProdutosFragmentToDetalheProdutoFragment("Pão Francês", 1.50f)
            findNavController().navigate(action)
        }
    }
}
