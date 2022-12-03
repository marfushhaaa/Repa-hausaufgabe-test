package girls.lead.unico.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import girls.lead.unico.R;
import girls.lead.unico.activities.StoryActivity;

public class StoryFragment11 extends Fragment {
    ImageView storyImg;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.story_fragment11, null);
        storyImg = view.findViewById(R.id.story_img11);
        storyImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((StoryActivity)getActivity()).changeFragment(new StoryFragment12());            }
        });

        return view;
    }
}
