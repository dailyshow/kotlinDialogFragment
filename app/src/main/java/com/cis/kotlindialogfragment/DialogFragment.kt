package com.cis.kotlindialogfragment

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_main.*

/**
 * A simple [Fragment] subclass.
 */
class DialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val listener = DialogListener()

        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("title")
        builder.setMessage("message")
        builder.setPositiveButton("확인", listener)
        builder.setNeutralButton("neutral", listener)
        builder.setNegativeButton("취소", listener)

        val alert = builder.create()

        return alert
    }

    inner class DialogListener : DialogInterface.OnClickListener {
        override fun onClick(dialog: DialogInterface?, which: Int) {
            val mainActivity = activity as MainActivity

            when(which) {
                DialogInterface.BUTTON_POSITIVE -> {
                    mainActivity.tv.text = "positive 버튼 눌림"
                }
                DialogInterface.BUTTON_NEUTRAL -> {
                    mainActivity.tv.text = "neutral 버튼 눌림"
                }
                DialogInterface.BUTTON_NEGATIVE -> {
                    mainActivity.tv.text = "negative 버튼 눌림"
                }
            }
        }
    }
}
