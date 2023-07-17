package com.piyal.myapplication.ui.home


import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.appbar.AppBarLayout
import com.piyal.myapplication.R
import com.piyal.myapplication.databinding.FragmentHomeBinding




class HomeFragment : Fragment() {



    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var toolbar: Toolbar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        // Make the app bar transparent

        toolbar = requireActivity().findViewById(R.id.toolbar)
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)

        // Customize the toolbar color
        toolbar.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.transparent))

        //image slider
        val imageSlider: ImageSlider = binding.imageSlider

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.forest_house,"Image 1", ScaleTypes.FIT ))
        imageList.add(SlideModel(R.drawable.gardens, "Image 2", ScaleTypes.FIT ))
        imageList.add(SlideModel(R.drawable.house, "Image 3", ScaleTypes.FIT ))
        imageList.add(SlideModel(R.drawable.image, "Image 4", ScaleTypes.FIT ))
        imageList.add(SlideModel(R.drawable.machan, "Image 5", ScaleTypes.FIT ))

        imageSlider.setImageList(imageList)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}