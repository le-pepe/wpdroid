package cl.skar.undiacomohoy.utilities;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import cl.skar.undiacomohoy.R;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class JsonTask extends AsyncTask<String, Void, String> {

    Context c;
    String type;

    public JsonTask(Context context) {
        this.c = context;
    }

    public JsonTask(Context c, String type) {
        this.c = c;
        this.type = type;
    }

    public JsonTask(String type) {
        this.type = type;
    }

    @Override
    protected void onPreExecute() {
        // TODO: Implement this method
        super.onPreExecute();
        if (this.c != null) {
            ProgressDialog pd = new ProgressDialog(c);
            pd.setMessage(c.getString(R.string.loading));
            pd.setCancelable(false);
            pd.show();
        }
    }

    @Override
    protected String doInBackground(String... params) {
        String url = (params.length == 0)?null:params[0];
        String jsonString = JSON.getJson(url);

        return null;
    }


}
