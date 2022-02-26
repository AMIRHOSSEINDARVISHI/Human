package code.with.cal.human

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class BodyFragment : Fragment(R.layout.fragment_body){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageViewBody = view.findViewById<ImageView>(R.id.show_image_body)

        val listImage = arrayOf(
            R.drawable.body1,
            R.drawable.body2,
            R.drawable.body3,
            R.drawable.body4,
            R.drawable.body5,
            R.drawable.body6,
            R.drawable.body7,
            R.drawable.body8,
            R.drawable.body9,
            R.drawable.body10,
            R.drawable.body11,
            R.drawable.body12
        )

        var index = 0

        imageViewBody.setOnClickListener{
            if (index>=12){
                index = 0
            }
            imageViewBody.setImageResource(listImage[index])
            index++
        }

    }
}