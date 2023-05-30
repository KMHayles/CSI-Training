function togglePDF(containerId) {
    let pdfContainer = document.getElementById(`tx-pdf-container-${containerId}`);

    if (pdfContainer.style.display === 'block') {
        pdfContainer.style.display = 'none';
    } else {
        pdfContainer.style.display = 'block';
    }
}