package code.with.cal.human

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class LogsFragment : Fragment(R.layout.fragment_logs){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageViewLegs = view.findViewById<ImageView>(R.id.show_image_logs)
        val listImage = arrayOf(
            R.drawable.legs1,
            R.drawable.legs2,
            R.drawable.legs3,
            R.drawable.legs4,
            R.drawable.legs5,
            R.drawable.legs6,
            R.drawable.legs7,
            R.drawable.legs8,
            R.drawable.legs9,
            R.drawable.legs10,
            R.drawable.legs11,
            R.drawable.legs12
        )

        var index = 0

        imageViewLegs.setOnClickListener{
            if (index>=12){
                index = 0
            }
            imageViewLegs.setImageResource(listImage[index])
            index++
        }

    }
}