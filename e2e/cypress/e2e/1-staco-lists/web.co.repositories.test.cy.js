describe('Coroutines Repositories', () => {
  beforeEach(() => {
    cy.visit('http://localhost:8080/login')
  })

  function login() {
    cy.get('#username').type('admin');
    cy.get('#password').type('admin');
    cy.get('button.btn.btn-primary').contains('Login').click();
  }

  it('logs into page with user admin', () => {
    login();
  })

  it('clicks through pages 1 to 10', () => {
    login();
    cy.get('p').contains('1').click();
    cy.get('p').contains('2').click();
    cy.get('p').contains('3').click();
    cy.get('p').contains('4').click();
    cy.get('p').contains('5').click();
  })

})