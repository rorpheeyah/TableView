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

#### Add header and cell programmatically
```java
tableview.addRows(rows); // List<String>
tableview.addHeader(list); // List<String>
```

#### Add cell listener
```java
tableview.setTableViewListener(new TableView.OnTableViewListener() {
  @Override
  public void onRowClicked(@NonNull TableRow tableRow, int position, List<String> row) {
         Toast.makeText(getApplicationContext(), row.toString(), Toast.LENGTH_SHORT).show();
  }
    
  @Override
  public void onLongClicked(@NonNull TableRow tableRow, int position, List<String> row) {
         Toast.makeText(getApplicationContext(), row.toString(), Toast.LENGTH_SHORT).show();
  }
});
```

###### Example

```Java
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        // Add Header
        String value = "증빙구분 | 가맹점명 | 사용일시 | 사용금액 | 신청금액 | 카드번호";
        List<String> list = Arrays.asList(value.split("\\|"));
        binding.tbv.addHeader(list);

        // Add Cells
        LinkedHashMap<Integer, List<String>> rows = new LinkedHashMap<>();
        for (int i = 0; i < 15; i++) {
            value = (i+1) + ".법인카드 영수증 | 교촌치킨 | 2021-07-01(일) 12:00 | 999,000원 | 999,000원 | ";
            rows.put(i, Arrays.asList(value.split("\\|")));
        }
        binding.tbv.addRows(rows);

        binding.tbv.setTableViewListener(new TableView.OnTableViewListener() {
            @Override
            public void onRowClicked(@NonNull TableRow tableRow, int position, List<String> row) {
                Toast.makeText(getApplicationContext(), row.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClicked(@NonNull TableRow tableRow, int position, List<String> row) {
                Toast.makeText(getApplicationContext(), row.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
```

