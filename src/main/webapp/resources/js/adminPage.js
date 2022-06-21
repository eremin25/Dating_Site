$(async function() {
    await showAllUsers();
})

const adminFetchService = {
    allUsers: async () => await fetch('http://localhost:8080/api/admin/users')
}

async function showAllUsers() {
    let allUsers = await adminFetchService.allUsers().then(response => response.json());
    allUsers.forEach(user => {
        $('#allUsers').append(
            `
            <li class="user">
                ID: ${user.id}<br>
                Username: ${user.username}<br>
                Email: ${user.email}<br>
                <br>
            </li>
            `
        );
    });
}