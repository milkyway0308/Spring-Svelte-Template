# Spring-Svelete-Template 
![Java CI with Gradle](https://github.com/milkyway0308/Spring-Svelte-Template/actions/workflows/gradle.yml/badge.svg)

This is a template project for Spring Boot and Svelte. It is a simple project that can be used as a starting point for a
full stack application using Spring Boot and Svelte.

## Getting started

To get started, clone the repository and run the gradle task `gradle build`.
All the necessary dependencies will be downloaded and the project will be built.

## Running the application

To run the application, run the gradle task `gradle bootRun`.
The application will start and be available at `http://localhost:8080`.
You can change the port by modifying the `server_port` property in the `application.properties` file.

## Running the frontend

It's not recommend to run the frontend, but if you want to run the frontend separately, run gradle
task `gradle runSvelte`.
Spring-Svelete-Template is built to run the frontend and backend together, so running the frontend separately is not
recommended.

## Gradle properties

As default, this project control core configuration with gradle properties.
DO NOT include `gradle.properties` files to commit to prevent leaking sensitive information.

Here's the list of properties that can be configured:

| Property            | Description                              | Default        |
|---------------------|------------------------------------------|----------------|
| kotlin_version      | The version of Kotlin to use.            | 1.9.22         | 
| coroutines_version  | The version of Kotlin Coroutines to use. | 1.7.3          | 
| target_java_version | The version of Java to target.           | 17             | 
| group_name          | The group name of the project.           | com.example    |
| main_class          | The main class of the project.           | HelloWorld     |
| version             | The version of the project.              | 0.0.1          |
| server_port         | The port the server will run on.         | 8080           |
| database_url        | The URL of the database.                 | localhost:3306 |
| database_table      | The name of the database table.          | test           |
| database_user       | The username of the database.            | root           |
| database_password   | The password of the database.            | root           |

## Template framework versions

Template can be outdated anytime, so you will need to update the versions of the frameworks used in the project.
Here are the versions of the frameworks used in the template:

| Framework   | Version |
|-------------|---------|
| Spring Boot | 3.2.0   |
| Java        | 17      |
| Kotlin      | 1.9.22  |
| Gradle      | 8.4     |
| Svelte      | 4.2.12  |
| Vite        | 5.2.0   |

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.