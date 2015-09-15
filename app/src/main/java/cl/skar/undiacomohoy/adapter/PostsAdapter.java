package cl.skar.undiacomohoy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import cl.skar.undiacomohoy.wp.WP_Post;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class PostsAdapter  extends RecyclerView.Adapter<PostsAdapter.Holder>{

    ArrayList<WP_Post> listPosts;
    int lastPosition = -1;

    public PostsAdapter(ArrayList<WP_Post> list){
        listPosts = list;
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Holder extends RecyclerView.ViewHolder{

        public Holder(View itemView) {
            super(itemView);
        }
    }
}
