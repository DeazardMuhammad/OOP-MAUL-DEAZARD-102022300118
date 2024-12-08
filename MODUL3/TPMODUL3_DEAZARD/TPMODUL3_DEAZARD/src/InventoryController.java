import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {

    @FXML
    private TableView<Album> albumTable;
    @FXML
    private TableColumn<Album, String> nameColumn;
    @FXML
    private TableColumn<Album, String> artistColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn;
    @FXML
    private TableColumn<Album, Integer> availableColumn;
    @FXML
    private TableColumn<Album, Integer> rentedColumn;

    @FXML
    private TextField albumNameField;
    @FXML
    private TextField artistField;
    @FXML
    private TextField totalField;
    @FXML
    private TextField availableField;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        albumList = FXCollections.observableArrayList();
        albumTable.setItems(albumList);

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        rentedColumn.setCellValueFactory(new PropertyValueFactory<>("rented"));

        albumTable.setOnMouseClicked(event -> {
            Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
            if (selectedAlbum != null) {
                albumNameField.setText(selectedAlbum.getAlbumName());
                artistField.setText(selectedAlbum.getArtist());
                totalField.setText(String.valueOf(selectedAlbum.getTotal()));
                availableField.setText(String.valueOf(selectedAlbum.getAvailable()));
            }
        });
    }

    public void handleTambah() {
        try {
            String name = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());
            albumList.add(new Album(name, artist, total, available, total - available));
            showAlert(Alert.AlertType.INFORMATION, "Album berhasil ditambahkan!");
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Input tidak valid!");
        }
    }

    public void handleHapus() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            showAlert(Alert.AlertType.INFORMATION, "Album berhasil dihapus!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Pilih album terlebih dahulu!");
        }
    }

    public void handleUpdate() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                selectedAlbum.setAlbumName(albumNameField.getText());
                selectedAlbum.setArtist(artistField.getText());
                selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                selectedAlbum.setAvailable(Integer.parseInt(availableField.getText()));
                selectedAlbum.setRented(selectedAlbum.getTotal() - selectedAlbum.getAvailable());
                albumTable.refresh();
                showAlert(Alert.AlertType.INFORMATION, "Album berhasil diupdate!");
            } catch (Exception e) {
                showAlert(Alert.AlertType.ERROR, "Input tidak valid!");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Pilih album terlebih dahulu!");
        }
    }

    public void handleRent() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                albumTable.refresh();
                showAlert(Alert.AlertType.INFORMATION, "Album berhasil disewa!");
            } else {
                showAlert(Alert.AlertType.ERROR, "Album tidak tersedia untuk disewa!");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Pilih album terlebih dahulu!");
        }
    }

    private void showAlert(Alert.AlertType alertType, String message) {
        Alert alert = new Alert(alertType);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
