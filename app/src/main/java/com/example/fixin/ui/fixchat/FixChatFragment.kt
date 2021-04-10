package com.example.fixin.ui.fixchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fixin.R
import com.example.fixin.databinding.FragmentChatBinding
import com.example.fixin.lib.User
import com.squareup.picasso.Picasso
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.item_chat_from_row.view.*
import kotlinx.android.synthetic.main.item_chat_to_row.view.*


class FixChatFragment : Fragment() {
    lateinit var binding: FragmentChatBinding
    val adapter = GroupAdapter<GroupieViewHolder>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChatBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
        adapter.add(ChatFromItem())
        adapter.add(ChatToItem())
        binding.IDChatRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.IDChatRecyclerview.adapter = adapter

    }
}

class ChatFromItem : Item<GroupieViewHolder>() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
//        viewHolder.itemView.chat_from_row.text = text
//        val url = user.profileImageUrl
//        val target = viewHolder.itemView.img_from_row
//        Picasso.get().load(url).into(target)
    }

    override fun getLayout(): Int {
        return R.layout.item_chat_from_row
    }

}

class ChatToItem() : Item<GroupieViewHolder>() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
//        viewHolder.itemView.chat_to_row.text = text
//        //load image user
//        val url = user.profileImageUrl
//        val target = viewHolder.itemView.img_to_row
//        Picasso.get().load(url).into(target)
    }

    override fun getLayout(): Int {
        return R.layout.item_chat_to_row
    }

}