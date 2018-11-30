package com.example.studentclock;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ClockViewHolder>{

    class ClockViewHolder extends RecyclerView.ViewHolder{

        private EditText clock_name;
        private Switch switch1;
        private Button time;
        private Button monday;
        private Button tuesday;
        private Button wedsday;
        private Button thuesday;
        private Button friday;
        private Button saturday;
        private Button sunday;

        public ClockViewHolder(View itemView){
            super(itemView);

            clock_name = itemView.findViewById(R.id.clock_name);
            switch1 = itemView.findViewById(R.id.switch1);
            time = itemView.findViewById(R.id.time);
            monday = itemView.findViewById(R.id.monday);
            tuesday = itemView.findViewById(R.id.tuesday);
            wedsday= itemView.findViewById(R.id.wendsday);
            thuesday = itemView.findViewById(R.id.thuesday);
            friday= itemView.findViewById(R.id.friday);
            saturday = itemView.findViewById(R.id.saturday);
            sunday = itemView.findViewById(R.id.sunday);

        }


    }
}
