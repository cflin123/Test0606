package com.example.cjcu.test0531;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CJCU on 2018/6/14.
 */

public class TransactionAdapter {

    private List<Person> trans;

    public TransactionAdapter(List<Person> trans) {
        this.trans = trans;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView cdate;
        private final TextView info;
        private final TextView amount;

        public ViewHolder(View itemView) {
            super(itemView);
            cdate = itemView.findViewById(R.id.tv_cdate);
            info = itemView.findViewById(R.id.tv_info);
            amount = itemView.findViewById(R.id.tv_amount);
        }
    }
}
