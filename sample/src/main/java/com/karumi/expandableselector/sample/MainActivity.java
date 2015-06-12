/*
 * Copyright (C) 2015 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.karumi.expandableselector.sample;

import android.app.Activity;
import android.os.Bundle;
import com.karumi.expandableselector.ExpandableItem;
import com.karumi.expandableselector.ExpandableSelector;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    initializeColorsExpandableSelector();
    initializeSizesExpandableSelector();
  }

  private void initializeColorsExpandableSelector() {
    ExpandableSelector expandableSelector = (ExpandableSelector) findViewById(R.id.es_colors);
    List<ExpandableItem> expandableItems = new ArrayList<ExpandableItem>();
    expandableItems.add(new ExpandableItem(R.drawable.item_brown));
    expandableItems.add(new ExpandableItem(R.drawable.item_green));
    expandableItems.add(new ExpandableItem(R.drawable.item_orange));
    expandableItems.add(new ExpandableItem(R.drawable.item_pink));
    expandableSelector.setExpandableItems(expandableItems);
  }

  private void initializeSizesExpandableSelector() {
    ExpandableSelector expandableSelector = (ExpandableSelector) findViewById(R.id.es_sizes);
    List<ExpandableItem> expandableItems = new ArrayList<ExpandableItem>();
    expandableItems.add(new ExpandableItem("XL"));
    expandableItems.add(new ExpandableItem("L"));
    expandableItems.add(new ExpandableItem("M"));
    expandableItems.add(new ExpandableItem("S"));
    expandableSelector.setExpandableItems(expandableItems);
  }
}
