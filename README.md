# TableView
TableView is an Android library for displaying data composed of rows and columns.

#### Preview result
![tableview](https://user-images.githubusercontent.com/55073535/149063697-7a8f4c6a-13f1-4ff3-9b63-a0dd07824f70.gif)

#### In your XML layout
```Xml
<com.rorpheeyah.tableview.TableView
     android:id="@+id/tbv"
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:overScrollMode="never"
     app:cellBackground="#F5F5F5"
     app:cellPadding="11dp"
     app:cellSelectedColor="#A3E4DB"
     app:cellTextColor="#3e4449"
     app:cellTextGravity="start"
     app:defaultEmptyCell="N\A"
     app:headerBackground="#D6E5FA"
     app:headerPadding="11dp"
     app:headerTextColor="#3e4449"
     app:headerTextGravity="start"
     app:isStretch="true"
     app:itemPreviewCount="10" />
```

#### Custom Attributes
| Attribute | Description |
| --- | --- |
| `cellBackground` | Color of cells background |
| `cellPadding` | Padding of cells |
| `cellSelectedColor` | Color of row select background |
| `cellTextColor` | Color of cell text color |
| `cellTextGravity` | Cell text gravity(start,center,end) |
| `headerBackground` | Color of header background |
| `headerPadding` | Padding of header |
| `headerTextColor` | Color of header text color |
| `headerTextGravity` | Header text gravity(start,center,end) |
| `defaultEmptyCell` | Default value string of empty cell |
| `isStretch` | Stretch cell to match parent (true/false)|
| `itemPreviewCount` | Amount of preview row |
