DROP TABLE IF EXISTS urls;

CREATE TABLE urls (
    id              SERIAL PRIMARY KEY,
    name            VARCHAR(255) NOT NULL,
    created_at       TIMESTAMP NOT NULL
);