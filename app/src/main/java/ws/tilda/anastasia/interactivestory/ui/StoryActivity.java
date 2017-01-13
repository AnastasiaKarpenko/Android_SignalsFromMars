package ws.tilda.anastasia.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import ws.tilda.anastasia.interactivestory.R;
import ws.tilda.anastasia.interactivestory.model.Page;
import ws.tilda.anastasia.interactivestory.model.Story;

public class StoryActivity extends AppCompatActivity {
    public static final String TAG = StoryActivity.class.getSimpleName();
    private Story mStory = new Story();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if(name == null) {
            name = "Friend";
        }
        Log.d(TAG, name);
    }

    public void loadPage() {
        Page page = mStory.getPage(0);

    }
}
