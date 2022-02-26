package code.with.cal.human

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class HeadFragment : Fragment(R.layout.fragment_head){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageViewHead = view.findViewById<ImageView>(R.id.show_image_head)

        val listImage = arrayOf(
            R.drawable.head1,
            R.drawable.head2,
            R.drawable.head3,
            R.drawable.head4,
            R.drawable.head5,
            R.drawable.head6,
            R.drawable.head7,
            R.drawable.head8,
            R.drawable.head9,
            R.drawable.head10,
            R.drawable.head11,
            R.drawable.head12
        )

        var index = 0

        imageViewHead.setOnClickListener{
            if (index>=12){
                index = 0
            }
            imageViewHead.setImageResource(listImage[index])
            index++
        }

    }
}