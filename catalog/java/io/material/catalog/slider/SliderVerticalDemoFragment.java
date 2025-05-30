/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.material.catalog.slider;

import io.material.catalog.R;

import static com.google.android.material.slider.SliderOrientation.HORIZONTAL;
import static com.google.android.material.slider.SliderOrientation.VERTICAL;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import io.material.catalog.feature.DemoFragment;

/**
 * Fragment to display a few basic uses of the vertical {@link Slider} widget for the Catalog app.
 */
public class SliderVerticalDemoFragment extends DemoFragment {

  @Nullable
  @Override
  public View onCreateDemoView(
      @NonNull LayoutInflater layoutInflater,
      @Nullable ViewGroup viewGroup,
      @Nullable Bundle bundle) {

    View view =
        layoutInflater.inflate(
            R.layout.cat_slider_demo_vertical, viewGroup, false /* attachToRoot */);

    Slider slider = view.findViewById(R.id.slider_vertical);
    MaterialSwitch switchButton = view.findViewById(R.id.switch_button);
    switchButton.setOnCheckedChangeListener(
        (buttonView, isChecked) -> slider.setOrientation(isChecked ? VERTICAL : HORIZONTAL));

    return view;
  }
}
