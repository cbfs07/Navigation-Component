package com.example.padariadeliciaapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetalheProdutoFragment : Fragment(R.layout.fragment_detalhe_produto) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Recebendo os argumentos passados via SafeArgs
        val args = DetalheProdutoFragmentArgs.fromBundle(requireArguments())

        val txtNome = view.findViewById<TextView>(R.id.txtNomeProduto)
        val txtPreco = view.findViewById<TextView>(R.id.txtPrecoProduto)

        txtNome.text = "Produto: ${args.produtoNome}"
        txtPreco.text = "Preço: R$ %.2f".format(args.produtoPreco)
    }
}
