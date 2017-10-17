package com.example.kckargul.delauro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArtworkDetailFragment extends Fragment {
    private long artworkId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            artworkId = savedInstanceState.getLong("artworkId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_artwork_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Artwork artwork = Artwork.artworkFigurative[(int) artworkId];
            title.setText(artwork.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(artwork.getImageResourceID());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("artworkId", artworkId);
    }

    public void setArtwork(long id) {
        this.artworkId = id;
    }}
