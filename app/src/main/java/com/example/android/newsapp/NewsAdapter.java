package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView tagView = (TextView) listItemView.findViewById(R.id.tag_text_view);
        tagView.setText(currentNews.getTag());

        TextView headlineView = (TextView) listItemView.findViewById(R.id.headline_text_view);
        headlineView.setText(currentNews.getHeadline());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date_text_view);
        dateView.setText(currentNews.getDate());

        TextView authorView = (TextView) listItemView.findViewById(R.id.author_text_view);
        authorView.setText(currentNews.getAuthor());

        return listItemView;
    }
}
