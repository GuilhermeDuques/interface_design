package com.project.at_projetointerfase.ui.cursos

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.project.at_projetointerfase.R
import com.project.at_projetointerfase.databinding.FragmentCursosBinding
import com.project.at_projetointerfase.databinding.FragmentFormacaoBinding
import com.project.at_projetointerfase.ui.formacao.FormacaoViewModel

class CursosFragment : Fragment() {

    private var _binding: FragmentCursosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val cursosViewModel =
            ViewModelProvider(this).get(CursosViewModel::class.java)

        _binding = FragmentCursosBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}