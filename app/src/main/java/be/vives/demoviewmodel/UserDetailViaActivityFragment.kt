package be.vives.demoviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.vives.demoviewmodel.databinding.FragmentUserDetailViaActivityBinding

class UserDetailViaActivityFragment : Fragment() {

    private lateinit var binding : FragmentUserDetailViaActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUserDetailViaActivityBinding.inflate(layoutInflater, container, false)
        val user = User("Dirk", "Hostens", false)
        binding.tvFirstName2.text = user.firstname
        binding.tvLastName2.text = user.lastName
        binding.swAvailable2.isChecked = user.available
        return binding.root
    }


}