// Generated by view binder compiler. Do not edit!
package com.example.mine.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mine.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDisplayJobInfo2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button11;

  @NonNull
  public final ImageButton imageButton17;

  @NonNull
  public final ImageButton imageButton18;

  @NonNull
  public final ImageButton imageButton19;

  @NonNull
  public final ImageButton imageButton20;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  private ActivityDisplayJobInfo2Binding(@NonNull ConstraintLayout rootView,
      @NonNull Button button11, @NonNull ImageButton imageButton17,
      @NonNull ImageButton imageButton18, @NonNull ImageButton imageButton19,
      @NonNull ImageButton imageButton20, @NonNull TextView textView6,
      @NonNull TextView textView7) {
    this.rootView = rootView;
    this.button11 = button11;
    this.imageButton17 = imageButton17;
    this.imageButton18 = imageButton18;
    this.imageButton19 = imageButton19;
    this.imageButton20 = imageButton20;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDisplayJobInfo2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDisplayJobInfo2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_display_job_info2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDisplayJobInfo2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button11;
      Button button11 = ViewBindings.findChildViewById(rootView, id);
      if (button11 == null) {
        break missingId;
      }

      id = R.id.imageButton17;
      ImageButton imageButton17 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton17 == null) {
        break missingId;
      }

      id = R.id.imageButton18;
      ImageButton imageButton18 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton18 == null) {
        break missingId;
      }

      id = R.id.imageButton19;
      ImageButton imageButton19 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton19 == null) {
        break missingId;
      }

      id = R.id.imageButton20;
      ImageButton imageButton20 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton20 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivityDisplayJobInfo2Binding((ConstraintLayout) rootView, button11,
          imageButton17, imageButton18, imageButton19, imageButton20, textView6, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}