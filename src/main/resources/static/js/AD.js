// function showPDF() {
//     let pdfContainer = document.querySelector('.pdf-container');
//     pdfContainer.style.display = 'block';
// }

// function togglePDF() {
//     let pdfContainer = document.querySelector('.pdf-container');
//
//     if (pdfContainer.style.display === 'block') {
//         pdfContainer.style.display = 'none';
//     } else {
//         pdfContainer.style.display = 'block';
//     }
// }

function togglePDF(containerId) {
    let pdfContainer = document.getElementById(`pdf-container-${containerId}`);

    if (pdfContainer.style.display === 'block') {
        pdfContainer.style.display = 'none';
    } else {
        pdfContainer.style.display = 'block';
    }
}
