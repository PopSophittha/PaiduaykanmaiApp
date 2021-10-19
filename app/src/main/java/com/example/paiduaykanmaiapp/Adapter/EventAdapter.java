package com.example.paiduaykanmaiapp.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paiduaykanmaiapp.Model.ActorModel;
import com.example.paiduaykanmaiapp.Model.EventModel;
import com.example.paiduaykanmaiapp.Model.RepoModel;
import com.example.paiduaykanmaiapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {

    private List<EventModel> mList;

    public EventAdapter(List<EventModel> mList) {
        this.mList = mList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView event_type;
        TextView actor_id, actor_login, actor_display_login, actor_gravatar_id, actor_url;
        TextView repo_id, repo_name, repo_url;
        ImageView actor_avatar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            event_type = itemView.findViewById(R.id.event_type);

            actor_id = itemView.findViewById(R.id.actor_id);
            actor_login = itemView.findViewById(R.id.actor_login);
            actor_display_login = itemView.findViewById(R.id.actor_display_login);
            actor_gravatar_id = itemView.findViewById(R.id.actor_gravatar_id);
            actor_avatar = itemView.findViewById(R.id.actor_avatar);
            actor_url = itemView.findViewById(R.id.actor_url);

            repo_id = itemView.findViewById(R.id.repo_id);
            repo_name = itemView.findViewById(R.id.repo_name);
            repo_url = itemView.findViewById(R.id.repo_url);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.adapter_event, parent, false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        EventModel obj = mList.get(position);

        //event
        holder.event_type.setText(obj.getType().concat(" (").concat(obj.getId()).concat(")"));

        //actor
        ActorModel actor = obj.getActor();
        holder.actor_id.setText("id: ".concat(actor.getId()));
        holder.actor_login.setText("login: ".concat(actor.getLogin()));
        holder.actor_display_login.setText("display login: ".concat(actor.getDisplay_login()));
        holder.actor_gravatar_id.setText("gravatar id: ".concat(actor.getGravatar_id()));
        holder.actor_url.setText(actor.getUrl());
        Picasso.get().load(actor.getAvatar_url()).into(holder.actor_avatar);

        //repo
        RepoModel repo = obj.getRepo();
        holder.repo_id.setText("Repository id:".concat(repo.getId()));
        holder.repo_name.setText("name: ".concat(repo.getName()));
        holder.repo_url.setText(repo.getUrl());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
