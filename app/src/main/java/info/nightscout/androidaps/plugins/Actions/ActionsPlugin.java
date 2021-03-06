package info.nightscout.androidaps.plugins.Actions;

import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.R;
import info.nightscout.androidaps.interfaces.PluginBase;

/**
 * Created by mike on 05.11.2016.
 */

public class ActionsPlugin implements PluginBase {

    boolean fragmentEnabled = true;
    boolean fragmentVisible = true;

    @Override
    public int getType() {
        return PluginBase.GENERAL;
    }

    @Override
    public String getFragmentClass() {
        return ActionsFragment.class.getName();
    }

    @Override
    public String getName() {
        return MainApp.sResources.getString(R.string.actions);
    }

    @Override
    public boolean isEnabled(int type) {
        return fragmentEnabled;
    }

    @Override
    public boolean isVisibleInTabs(int type) {
        return fragmentVisible;
    }

    @Override
    public boolean canBeHidden(int type) {
        return true;
    }

    @Override
    public void setFragmentEnabled(int type, boolean fragmentEnabled) {
        this.fragmentEnabled = fragmentEnabled;
    }

    @Override
    public void setFragmentVisible(int type, boolean fragmentVisible) {
        this.fragmentVisible = fragmentVisible;
    }

}
