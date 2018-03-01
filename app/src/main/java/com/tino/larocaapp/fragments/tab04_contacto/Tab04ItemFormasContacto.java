package com.tino.larocaapp.fragments.tab04_contacto;


import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/*import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;*/
import com.tino.larocaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab04ItemFormasContacto extends Fragment {

    private TextView textFormasContacto;
    private String caption = new String();

    public static String FACEBOOK_URL = "https://www.facebook.com/iglesialacapilla";
    public static String FACEBOOK_PAGE_ID = "iglesialacapilla";


    public Tab04ItemFormasContacto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab04_item_formas_contacto, container, false);

        caption = "Haz clic en nuestra página de Facebook:";


        textFormasContacto = (TextView)view.findViewById(R.id.textFormasContacto);
        textFormasContacto.setText(caption);

        // crea botón y le cambia la imagen programáticamente
        final Button btFacebook = (Button)view.findViewById(R.id.btFacebook);
        btFacebook.setBackgroundResource(R.drawable.logo_pag_facebook);
        btFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Al hacer click al botón creado, se abre la página de la iglesia en
                // Facebook, sea por el app de Facebook o vía web
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(getContext());
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);
            }
        });

        return view;
    }

    //método para llamar a la página web de la iglesia
    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }

}
