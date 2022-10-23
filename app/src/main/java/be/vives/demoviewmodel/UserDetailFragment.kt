package be.vives.demoviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.vives.demoviewmodel.databinding.FragmentUserDetailBinding

class UserDetailFragment : Fragment() {

    private lateinit var binding: FragmentUserDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentUserDetailBinding.inflate(layoutInflater,  container, false)
        val user = User("Dirk", "Hostens", false)
        binding.tvFirstName.text = user.firstname
        binding.tvLastName.text = user.lastName
        binding.swAvailable.isChecked = user.available
        return binding.root
    }


}