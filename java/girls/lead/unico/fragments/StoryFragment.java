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

public class StoryFragment extends Fragment {
    ImageView storyImg, storyImg2, b;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.story_fragment, null);
        storyImg = view.findViewById(R.id.story_img);
        storyImg2 = view.findViewById(R.id.story_img8);
//        b = view.findViewById(R.id.button);
//        ((StoryActivity)getActivity()).changeImgStory(storyImg2, storyImg, storyImg);


//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ((StoryActivity)getActivity()).changeImgStory(1, storyImg);
//            }
//        });
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ((StoryActivity)getActivity()).changeImgStory(2, storyImg);
//            }
//        });

//        for (int i = 0; i < ((StoryActivity) getActivity()).storyImages.length; i++) {
//            int finalI = i;
//            b.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    ((StoryActivity)getActivity()).changeImgStory(finalI, storyImg);
//
//                }
//            });
//            continue;
//        }
        storyImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((StoryActivity)getActivity()).changeFragment(new StoryFragment2());
            }
        });


        return view;
    }
    
}
