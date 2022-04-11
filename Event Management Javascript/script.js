let add = document.getElementById("add-btn");
let tdata = document.querySelector("tbody");
let thead = document.querySelector("thead");
add.addEventListener("click", function () {
  let name = document.getElementById("event_name").value;
  let venue = document.getElementById("venue").value;
  let date = document.getElementById("date").value;
  let cost_per = document.getElementById("cost_per").value;
  let no_day = document.getElementById("no_day").value;
  let no = document.getElementById("add").rows.length;
  let total = cost_per * no_day;
  if (no === 0) {
    thead.innerHTML = `<tr>
    <th>Event Name</th>
    <th>Vanue</th>
    <th>Date</th>
    <th>total cost</th>
    <th>Cancel Event</th>
  </tr>`;

    tdata.innerHTML += `<tr>
                           <td>${name}</td>
                           <td>${venue}</td>
                           <td>${date}</td>
                           <td>${total}</td>
                           <td><a href="#" id="link${no}" onclick="deleted(this)">Cancel</a></td>
                        </tr>`;
  } else {
    tdata.innerHTML += `<tr>
                           <td>${name}</td>
                           <td>${venue}</td>
                           <td>${date}</td>
                           <td>${total}</td>
                           <td><a href="#" id="link${no}" onclick="deleted(this)">Cancel</a></td>
                        </tr>`;
  }
});

function deleted(e) {
  let ele = e;
  ele.closest("tr").remove();
  let no = document.getElementById("add").rows.length;
  if (no === 1) {
    thead.innerHTML = "";
    document.getElementById("empty").textContent = "No Event Listed";
  }
}
