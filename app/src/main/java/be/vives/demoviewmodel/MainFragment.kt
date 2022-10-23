package be.vives.demoviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import be.vives.demoviewmodel.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater,  container, false)

        binding.btnNavigateToUserDetail.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToUserDetailFragment())
        }
        binding.btnNavigarteUserDetailActivity.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToUserActivity())
        }
        return binding.root
    }


}