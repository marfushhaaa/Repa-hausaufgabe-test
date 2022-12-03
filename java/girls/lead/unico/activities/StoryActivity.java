package girls.lead.unico.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import girls.lead.unico.R;
import girls.lead.unico.fragments.StoryFragment;

public class StoryActivity extends AppCompatActivity {
    public int[] storyImages = {
        R.drawable.story_2, R.drawable.story_3,
        R.drawable.story_3, R.drawable.story_4,
        R.drawable.story_5, R.drawable.story_6, R.drawable.story_7};
//    int i = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_activity);
        add();





    }
    public void changeImgStory(ImageView show, ImageView hide, ImageView button){
        Animation open = AnimationUtils.loadAnimation(this, R.anim.open_anim);
        Animation close = AnimationUtils.loadAnimation(this, R.anim.close_anim);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hide.setAnimation(close);
                close.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        hide.setVisibility(View.INVISIBLE);
                        show.startAnimation(open);
                        open.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {
                                show.setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }
                        });
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });

    }
    public void add(){
        FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
        ft.add(R.id.story_add,  new StoryFragment());
        ft.commit();
    }
    public void changeFragment(final Fragment fragment){
        FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.replace(R.id.story_add, fragment);
        ft.commit();
    }
    public void onBackPressed() {
        // Do Here what ever you want do on back press;

    }
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.open_anim, R.anim.close_anim);
    }
    public void changeActivities(){
        Intent i = new Intent(StoryActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
